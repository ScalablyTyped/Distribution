package typings.ahooks.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource[TData /* <: typings.ahooks.typesMod.Data */]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dataSource: /* import warning: importer.ImportType#apply Failed type conversion: TData['list'] */ js.Any = js.native
  
  var loading: Boolean = js.native
  
  def onChange(pagination: Any): Unit = js.native
  def onChange(pagination: Any, filters: Any): Unit = js.native
  def onChange(pagination: Any, filters: Any, sorter: Any): Unit = js.native
  def onChange(pagination: Any, filters: Unit, sorter: Any): Unit = js.native
  
  var pagination: Any = js.native
}
