package typings.antd

import typings.antd.tableInterfaceMod.ColumnTitle
import typings.antd.tableInterfaceMod.ColumnTitleProps
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableUtilMod {
  
  @JSImport("antd/lib/table/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getColumnKey[RecordType](column: ColumnType[RecordType], defaultKey: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumnKey")(column.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  @scala.inline
  def getColumnPos(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getColumnPos")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getColumnPos(index: Double, pos: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumnPos")(index.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def renderColumnTitle[RecordType](title: ColumnTitle[RecordType], props: ColumnTitleProps[RecordType]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderColumnTitle")(title.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
