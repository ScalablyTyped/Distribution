package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read/write access to an accelerator configuration set.
  *
  * Such configuration set base on: ; Key events structureand Commands, which are represented as URLs; describing a function, which and can be executed
  * using the dispatch API.
  *
  * Note further: ;  All changes you made on this configuration access modify the the configuration set inside memory only. You have to use the {@link
  * com.sun.star.util.XFlushable} interface (which must be available at the same implementation object too), to make it persistent.
  * @see AcceleratorConfiguration
  * @see dom.sun.star.util.XFlushable
  * @since OOo 2.0
  */
trait XAcceleratorConfiguration
  extends XUIConfigurationPersistence
     with XUIConfigurationStorage
     with XUIConfiguration {
  /**
    * return the list of all key events, which are available at this configuration set.
    *
    * The key events are the "primary keys" of this configuration sets. Means: Commands are registered for key events.
    *
    * Such key event can be mapped to its bound command, using the method getCommandForKeyEvent().
    * @returns A list of key events.
    * @see getCommandForKeyEvent().
    */
  val AllKeyEvents: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
  /**
    * return the list of all key events, which are available at this configuration set.
    *
    * The key events are the "primary keys" of this configuration sets. Means: Commands are registered for key events.
    *
    * Such key event can be mapped to its bound command, using the method getCommandForKeyEvent().
    * @returns A list of key events.
    * @see getCommandForKeyEvent().
    */
  def getAllKeyEvents(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
  /**
    * return the registered command for the specified key event.
    *
    * This function can be used to: ; by a generic service, which can execute commands if a keyboard event occurs.or to iterate over the whole container and
    * change some accelerator bindings.
    * @param aKeyEvent the key event, where the registered command is searched for.
    * @returns The registered command for the specified key event.
    * @throws com::sun::star::container::NoSuchElementException if the key event is an invalid one or does not exists inside this configuration set.
    */
  def getCommandByKeyEvent(aKeyEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent): java.lang.String
  /**
    * optimized access to the relation "command-key" instead of "key-command" which is provided normally by this interface.
    *
    * It can be used to implement collision handling, if more than one key event match to the same command. The returned list contains all possible key
    * events - and the outside code can select an possible one. Of course - mostly this list will contain only one key event ...
    * @param sCommand the command, where key bindings are searched for.
    * @returns A list of {@link com.sun.star.awt.KeyEvent} structures, where the specified command is registered for.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified command is empty. It can't be checked, if a command is valid - because every URL
    * @throws com::sun::star::container::NoSuchElementException if the specified command isn't empty but does not occur inside this configuration set.
    */
  def getKeyEventsByCommand(sCommand: java.lang.String): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
  /**
    * optimized function to map a list of commands to a corresponding list of key events.
    *
    * It provides a fast mapping, which is e.g. needed by a menu or toolbar implementation. E.g. a sub menu is described by a list of commands - and the
    * implementation of the menu must show the corresponding shortcuts. Iteration over all items of this configuration set can be very expensive.
    *
    * Instead to the method getKeyEventsForCommand() the returned list contains only one(!) key event bound to one(!) requested command. If more than one
    * key event is bound to a command - a selection is done inside this method. This internal selection can't be influenced from outside.
    * @param lCommandList a list of commands
    * @returns A (non packed!) list of key events, where every item match by index directly to a command of the specified **CommandList** . If a command does no
    * @throws com::sun::star::lang::IllegalArgumentException if at least one of the specified commands is empty. It can't be checked, if a command is valid - b
    */
  def getPreferredKeyEventsForCommandList(lCommandList: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[_]
  /**
    * search for an key-command-binding inside this configuration set, where the specified command is used.
    *
    * If such binding could be located, the command will be removed from it. If as result of that the key binding will be empty, if will be removed too.
    *
    * This is an optimized method, which can perform removing of commands from this configuration set. Because normally Commands are "foreign keys" and key
    * identifier the "primary keys" - it needs some work to remove all commands outside this container ...
    * @param sCommand the command, which should be removed from any key binding.
    * @throws com::sun::star::lang::IllegalArgumentException if the specified command is empty.
    * @throws com::sun::star::container::NoSuchElementException if the specified command isn't used inside this configuration set.
    */
  def removeCommandFromAllKeyEvents(sCommand: java.lang.String): scala.Unit
  /**
    * remove a key-command-binding from this configuration set.
    * @param aKeyEvent the key event, which should be removed.
    * @throws com::sun::star::container::NoSuchElementException if the key event does not exists inside this configuration set.
    */
  def removeKeyEvent(aKeyEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent): scala.Unit
  /**
    * modify or create a key - command - binding.
    *
    * If the specified key event does not already exists inside this configuration access, it will be created and the command will be registered for it.
    *
    * If the specified key event already exists, its command will be overwritten with the new command. There is no warning nor any error about that! The
    * outside code has to use the method getCommandForKeyEvent() to check for possible collisions.
    *
    * Note: This method can't be used to remove entities from the configuration set. Empty parameters will result into an exception! Use the method {@link
    * removeKeyEvent()} instead.
    * @param aKeyEvent specify the key event, which must be updated or new created.
    * @param sCommand the new command for the specified key event.
    * @see removeKeyEvent()
    * @throws com::sun::star::lang::IllegalArgumentException if the key event isn't a valid one. Commands can be checked only, if they are empty. Because every
    */
  def setKeyEvent(aKeyEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, sCommand: java.lang.String): scala.Unit
}

object XAcceleratorConfiguration {
  @scala.inline
  def apply(
    AllKeyEvents: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent],
    acquire: js.Function0[scala.Unit],
    addConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    getAllKeyEvents: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
    ],
    getCommandByKeyEvent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, java.lang.String],
    getKeyEventsByCommand: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent]
    ],
    getPreferredKeyEventsForCommandList: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    hasStorage: js.Function0[scala.Boolean],
    isModified: js.Function0[scala.Boolean],
    isReadOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function0[scala.Unit],
    removeCommandFromAllKeyEvents: js.Function1[java.lang.String, scala.Unit],
    removeConfigurationListener: js.Function1[XUIConfigurationListener, scala.Unit],
    removeKeyEvent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, scala.Unit],
    setKeyEvent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.KeyEvent, 
      java.lang.String, 
      scala.Unit
    ],
    setStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit],
    store: js.Function0[scala.Unit],
    storeToStorage: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, scala.Unit]
  ): XAcceleratorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllKeyEvents")(AllKeyEvents)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addConfigurationListener")(addConfigurationListener)
    __obj.updateDynamic("getAllKeyEvents")(getAllKeyEvents)
    __obj.updateDynamic("getCommandByKeyEvent")(getCommandByKeyEvent)
    __obj.updateDynamic("getKeyEventsByCommand")(getKeyEventsByCommand)
    __obj.updateDynamic("getPreferredKeyEventsForCommandList")(getPreferredKeyEventsForCommandList)
    __obj.updateDynamic("hasStorage")(hasStorage)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("isReadOnly")(isReadOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("reload")(reload)
    __obj.updateDynamic("removeCommandFromAllKeyEvents")(removeCommandFromAllKeyEvents)
    __obj.updateDynamic("removeConfigurationListener")(removeConfigurationListener)
    __obj.updateDynamic("removeKeyEvent")(removeKeyEvent)
    __obj.updateDynamic("setKeyEvent")(setKeyEvent)
    __obj.updateDynamic("setStorage")(setStorage)
    __obj.updateDynamic("store")(store)
    __obj.updateDynamic("storeToStorage")(storeToStorage)
    __obj.asInstanceOf[XAcceleratorConfiguration]
  }
}

