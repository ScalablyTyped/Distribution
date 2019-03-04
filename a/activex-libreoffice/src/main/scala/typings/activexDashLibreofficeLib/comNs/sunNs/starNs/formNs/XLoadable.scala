package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to implement objects which may be loaded.
  *
  * The object is typically implemented by high-level objects which can connect to a data source.
  * @see XLoadListener
  */
trait XLoadable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive load-related events
    * @param aListener the listener to add.
    */
  def addLoadListener(aListener: XLoadListener): scala.Unit
  /** returns if the object is in loaded state. */
  def isLoaded(): scala.Boolean
  /**
    * loads the data.
    *
    * If the data is already loaded (->isLoaded), then the method returns silently. In this case, you should use ->reload.
    */
  def load(): scala.Unit
  /**
    * does a smart refresh of the object.
    *
    * The final state will be the same as if unload and load were called, but reload is the more efficient way to do the same. If the object isn't loaded,
    * nothing happens.
    */
  def reload(): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    */
  def removeLoadListener(aListener: XLoadListener): scala.Unit
  /** unloads the data. */
  def unload(): scala.Unit
}

object XLoadable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addLoadListener: js.Function1[XLoadListener, scala.Unit],
    isLoaded: js.Function0[scala.Boolean],
    load: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function0[scala.Unit],
    removeLoadListener: js.Function1[XLoadListener, scala.Unit],
    unload: js.Function0[scala.Unit]
  ): XLoadable = {
    val __obj = js.Dynamic.literal(acquire = acquire, addLoadListener = addLoadListener, isLoaded = isLoaded, load = load, queryInterface = queryInterface, release = release, reload = reload, removeLoadListener = removeLoadListener, unload = unload)
  
    __obj.asInstanceOf[XLoadable]
  }
}

