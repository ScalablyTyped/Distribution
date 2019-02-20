package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a high level API to organize document templates
  *
  * Template information are saved as links to the original content and organized in groups. This data should be persistent and can be updated by calling
  * special method {@link XDocumentTemplates.update()} . A real implementation of this interface can do that on top of an ucb content provider. Method
  * {@link XDocumentTemplates.getContent()} force that.
  */
trait XDocumentTemplates
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  val Content: activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent
  /**
    * creates a new group
    * @param GroupName the name of the group to be created
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def addGroup(GroupName: java.lang.String): scala.Boolean
  /**
    * creates the template with the given name in the given group using the given URL
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param SourceURL specifies the position of template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.storeTemplate()
    */
  def addTemplate(GroupName: java.lang.String, TemplateName: java.lang.String, SourceURL: java.lang.String): scala.Boolean
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  def getContent(): activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.XContent
  /**
    * remove an existing group
    * @param GroupName the name of the group to be removed
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeGroup(GroupName: java.lang.String): scala.Boolean
  /**
    * remove a template from specified group
    * @param GroupName specifies the group which include the template
    * @param TemplateName specifies the template for delete
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeTemplate(GroupName: java.lang.String, TemplateName: java.lang.String): scala.Boolean
  /**
    * rename an existing group
    * @param OldGroupName the old name of the group
    * @param NewGroupName the new name of the group
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameGroup(OldGroupName: java.lang.String, NewGroupName: java.lang.String): scala.Boolean
  /**
    * rename a template inside specified group
    * @param GroupName specifies the group which include the template
    * @param OldTemplateName specifies the template for renaming
    * @param NewTemplateName specifies the new name for the template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameTemplate(GroupName: java.lang.String, OldTemplateName: java.lang.String, NewTemplateName: java.lang.String): scala.Boolean
  /**
    * creates the template with the given name in the given group using the data from the storable
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param Storable specifies the target
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.addTemplate()
    */
  def storeTemplate(GroupName: java.lang.String, TemplateName: java.lang.String, Storable: XStorable): scala.Boolean
  /**
    * force an update for internal structures
    *
    * Because the templates are well known by links and not as direct content they can be outdated. An update force actualization of that to find wrong
    * links.
    */
  def update(): scala.Unit
}

