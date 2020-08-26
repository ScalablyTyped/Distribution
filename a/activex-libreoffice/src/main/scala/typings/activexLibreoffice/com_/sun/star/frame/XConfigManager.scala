package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XConfigManager extends XInterface {
  /**
    * add a listener to notify changes on well known variables inside the real implementation
    *
    * Listener can update its text values by calling {@link XConfigManager.substituteVariables()} again. If **KeyName** specifies a group of keys, the
    * listener gets one notify for each subkey.
    * @deprecated Deprecated
    * @param KeyName specifies variable about listener will be informed on changes
    * @param Listener listener which will be informed
    * @see XConfigManager.removePropertyChangeListener()
    */
  def addPropertyChangeListener(KeyName: String, Listener: XPropertyChangeListener): Unit = js.native
  /**
    * was designed for additional functionality for interface {@link com.sun.star.registry.XSimpleRegistry} and make no sense without that
    * @deprecated Deprecated
    */
  def flush(): Unit = js.native
  /**
    * remove a registered listener
    * @deprecated Deprecated
    * @param KeyName specifies variable on which listener was registered
    * @param Listener listener which will be deregistered
    * @see XConfigManager.addPropertyChangeListener()
    */
  def removePropertyChangeListener(KeyName: String, Listener: XPropertyChangeListener): Unit = js.native
  /**
    * substitute variables (place holder) inside given parameter **Text**
    *
    * The value of **Text** is NOT changed.
    * @param Text original value including variables
    * @returns changed copy of **Text** without any variables
    */
  def substituteVariables(Text: String): String = js.native
}

object XConfigManager {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    flush: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    substituteVariables: String => String
  ): XConfigManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), substituteVariables = js.Any.fromFunction1(substituteVariables))
    __obj.asInstanceOf[XConfigManager]
  }
  @scala.inline
  implicit class XConfigManagerOps[Self <: XConfigManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddPropertyChangeListener(value: (String, XPropertyChangeListener) => Unit): Self = this.set("addPropertyChangeListener", js.Any.fromFunction2(value))
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    @scala.inline
    def setRemovePropertyChangeListener(value: (String, XPropertyChangeListener) => Unit): Self = this.set("removePropertyChangeListener", js.Any.fromFunction2(value))
    @scala.inline
    def setSubstituteVariables(value: String => String): Self = this.set("substituteVariables", js.Any.fromFunction1(value))
  }
  
}

