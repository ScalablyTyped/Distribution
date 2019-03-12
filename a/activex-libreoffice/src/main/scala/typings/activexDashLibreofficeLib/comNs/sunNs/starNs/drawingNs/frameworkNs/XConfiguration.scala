package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A configuration describes the resources of an application like panes, views, and tool bars and their relationships that are currently active or are
  * requested to be activated. Resources are specified by {@link ResourceId} structures rather than references so that not only the current configuration
  * but also a requested configuration can be represented.
  *
  * Direct manipulation of a configuration object is not advised with the exception of the {@link ConfigurationController} and objects that implement the
  * {@link XConfigurationChangeRequest} interface.
  * @see XConfigurationController
  */
trait XConfiguration
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable {
  /**
    * Add a resource to the configuration.
    *
    * This method should be used only by objects that implement the XConfigurationRequest interface or by the configuration controller.
    * @param xResourceId The resource to add to the configuration. When the specified resource is already part of the configuration then this call is silently
    * @throws IllegalArgumentException When an empty resource id is given then an IllegalArgumentException is thrown.
    */
  def addResource(xResourceId: XResourceId): scala.Unit
  /**
    * Returns the list of resources that are bound directly and/or indirectly to the given anchor. A URL filter can reduce the set of returned resource ids.
    * @param xAnchorId This anchor typically is either a pane or an empty {@link XResourceId} object. An empty reference is treated like an {@link XResourceId
    * @param sTargetURLPrefix When a non-empty string is given then resource ids are returned only when their resource URL matches this prefix, i.e. when it b
    * @param eSearchMode This flag defines whether to return only resources that are directly bound to the given anchor or a recursive search is to be made. N
    * @returns The set of returned resource ids may be empty when there are no resource ids that match all conditions. The resources in the sequence are ordered
    */
  def getResources(xAnchorId: XResourceId, sTargetURLPrefix: java.lang.String, eSearchMode: AnchorBindingMode): stdLib.SafeArray[XResourceId]
  /**
    * Returns whether the specified resource is part of the configuration.
    *
    * This is independent of whether the resource does really exist and is active, i.e. has a visible representation in the GUI.
    * @param xResourceId The id of a resource. May be empty (empty reference or empty {@link XResourceId} object) in which case `FALSE` is returned.
    * @returns Returns `TRUE` when the resource is part of the configuration and `FALSE` when it is not.
    */
  def hasResource(xResourceId: XResourceId): scala.Boolean
  /**
    * Remove a resource from the configuration.
    *
    * This method should be used only by objects that implement the XConfigurationRequest interface or by the configuration controller.
    * @param xResourceId The resource to remove from the configuration. When the specified resource is not part of the configuration then this call is silentl
    * @throws IllegalArgumentException When an empty resource id is given then an IllegalArgumentException is thrown.
    */
  def removeResource(xResourceId: XResourceId): scala.Unit
}

object XConfiguration {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addResource: XResourceId => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    getResources: (XResourceId, java.lang.String, AnchorBindingMode) => stdLib.SafeArray[XResourceId],
    hasResource: XResourceId => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeResource: XResourceId => scala.Unit
  ): XConfiguration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addResource = js.Any.fromFunction1(addResource), createClone = js.Any.fromFunction0(createClone), getResources = js.Any.fromFunction3(getResources), hasResource = js.Any.fromFunction1(hasResource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeResource = js.Any.fromFunction1(removeResource))
  
    __obj.asInstanceOf[XConfiguration]
  }
}

