package typings.antd

import typings.antd.tableInterfaceMod.ColumnTitleProps
import typings.antd.tableInterfaceMod.TransformColumns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTitleColumnsMod {
  
  @JSImport("antd/lib/table/hooks/useTitleColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](columnTitleProps: ColumnTitleProps[RecordType]): js.Array[TransformColumns[RecordType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(columnTitleProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[TransformColumns[RecordType]]]
}
