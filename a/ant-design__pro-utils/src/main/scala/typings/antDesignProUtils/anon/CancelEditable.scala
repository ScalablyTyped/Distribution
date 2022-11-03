package typings.antDesignProUtils.anon

import typings.antDesignProUtils.esUseEditableArrayMod.ActionTypeText
import typings.antDesignProUtils.esUseEditableArrayMod.RecordKey
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelEditable[RecordType] extends StObject {
  
  def actionRender(key: RecordKey): js.Array[js.UndefOr[Element | ReactNode]] = js.native
  def actionRender(key: RecordKey, config: ActionTypeText[RecordType]): js.Array[js.UndefOr[Element | ReactNode]] = js.native
  
  def cancelEditable(recordKey: RecordKey): Boolean = js.native
  
  var editableKeys: js.Array[Key] = js.native
  
  def isEditable(recordKey: RecordKey): Boolean = js.native
  
  def setEditableRowKeys(updater: js.Array[Key]): Unit = js.native
  def setEditableRowKeys(updater: js.Array[Key], ignoreDestroy: Boolean): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]]): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]], ignoreDestroy: Boolean): Unit = js.native
  
  def startEditable(recordKey: RecordKey): Boolean = js.native
}
