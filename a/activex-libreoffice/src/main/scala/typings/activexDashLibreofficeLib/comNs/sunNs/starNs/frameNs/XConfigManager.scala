package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XConfigManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * add a listener to notify changes on well known variables inside the real implementation
    *
    * Listener can update his text values by calling {@link XConfigManager.substituteVariables()} again. If **KeyName** specifies a group of keys, the
    * listener gets one notify for each subkey.
    * @deprecated Deprecated
    * @param KeyName specifies variable about listener will be informed on changes
    * @param Listener listener which will be informed
    * @see XConfigManager.removePropertyChangeListener()
    */
  def addPropertyChangeListener(
    KeyName: java.lang.String,
    Listener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
  ): scala.Unit
  /**
    * was designed for additional functionality for interface {@link com.sun.star.registry.XSimpleRegistry} and make no sense without that
    * @deprecated Deprecated
    */
  def flush(): scala.Unit
  /**
    * remove a registered listener
    * @deprecated Deprecated
    * @param KeyName specifies variable on which listener was registered
    * @param Listener listener which will be deregistered
    * @see XConfigManager.addPropertyChangeListener()
    */
  def removePropertyChangeListener(
    KeyName: java.lang.String,
    Listener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
  ): scala.Unit
  /**
    * substitute variables (place holder) inside given parameter **Text**
    *
    * The value of **Text** is NOT changed.
    * @param Text original value including variables
    * @returns changed copy of **Text** without any variables
    */
  def substituteVariables(Text: java.lang.String): java.lang.String
}

object XConfigManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    flush: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    substituteVariables: js.Function1[java.lang.String, java.lang.String]
  ): XConfigManager = {
    val __obj = js.Dynamic.literal(acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, flush = flush, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, substituteVariables = substituteVariables)
  
    __obj.asInstanceOf[XConfigManager]
  }
}

