package typings.antd

import typings.antd.libTableInterfaceMod.ColumnTitle
import typings.antd.libTableInterfaceMod.ColumnTitleProps
import typings.antd.libTableInterfaceMod.ColumnType
import typings.antd.libTableInterfaceMod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableUtilMod {
  
  @JSImport("antd/lib/table/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getColumnKey[RecordType](column: ColumnType[RecordType], defaultKey: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumnKey")(column.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any])).asInstanceOf[Key]
  
  inline def getColumnPos(index: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getColumnPos")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getColumnPos(index: Double, pos: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getColumnPos")(index.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def renderColumnTitle[RecordType](title: ColumnTitle[RecordType], props: ColumnTitleProps[RecordType]): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("renderColumnTitle")(title.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
}
