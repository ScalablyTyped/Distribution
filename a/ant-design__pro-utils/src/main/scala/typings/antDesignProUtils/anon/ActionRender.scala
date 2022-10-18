package typings.antDesignProUtils.anon

import typings.antDesignProUtils.antDesignProUtilsBooleans.`true`
import typings.antDesignProUtils.esUseEditableArrayMod.AddLineOptions
import typings.antDesignProUtils.esUseEditableArrayMod.NewLineConfig
import typings.antDesignProUtils.esUseEditableArrayMod.RecordKey
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionRender[RecordType] extends StObject {
  
  def actionRender(row: RecordType & Index): js.Array[Element | Null | ReactNode] = js.native
  
  def addEditRecord(row: RecordType): Boolean = js.native
  def addEditRecord(row: RecordType, options: AddLineOptions): Boolean = js.native
  
  def cancelEditable(recordKey: RecordKey): js.Promise[js.UndefOr[`true`]] = js.native
  def cancelEditable(recordKey: RecordKey, needReTry: Boolean): js.Promise[js.UndefOr[`true`]] = js.native
  
  var editableKeys: js.Array[Key] = js.native
  
  def isEditable(row: RecordType & Index): IsEditable = js.native
  
  var newLineRecord: js.UndefOr[NewLineConfig[RecordType]] = js.native
  
  def onValuesChange(value: RecordType, values: RecordType): Unit = js.native
  
  var preEditableKeys: js.UndefOr[js.Array[Key]] = js.native
  
  def setEditableRowKeys(updater: js.Array[Key]): Unit = js.native
  def setEditableRowKeys(updater: js.Array[Key], ignoreDestroy: Boolean): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]]): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]], ignoreDestroy: Boolean): Unit = js.native
  
  def startEditable(recordKey: Key): Boolean = js.native
}
