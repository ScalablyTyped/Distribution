package typings.antd

import typings.antd.tableInterfaceMod.ColumnTitle
import typings.antd.tableInterfaceMod.ColumnTitleProps
import typings.antd.tableInterfaceMod.ColumnType
import typings.antd.tableInterfaceMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableUtilMod {
  
  @JSImport("antd/lib/table/util", "getColumnKey")
  @js.native
  def getColumnKey[RecordType](column: ColumnType[RecordType], defaultKey: String): Key = js.native
  
  @JSImport("antd/lib/table/util", "getColumnPos")
  @js.native
  def getColumnPos(index: Double): String = js.native
  @JSImport("antd/lib/table/util", "getColumnPos")
  @js.native
  def getColumnPos(index: Double, pos: String): String = js.native
  
  @JSImport("antd/lib/table/util", "renderColumnTitle")
  @js.native
  def renderColumnTitle[RecordType](title: ColumnTitle[RecordType], props: ColumnTitleProps[RecordType]): js.Any = js.native
}
