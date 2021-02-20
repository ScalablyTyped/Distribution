package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TableList
import typings.arcgisJsApi.esri.TableListConstructor
import typings.arcgisJsApi.esri.TableListProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableListMod extends Shortcut {
  
  @JSImport("esri/widgets/TableList", JSImport.Namespace)
  @js.native
  val ^ : TableListConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/TableList", JSImport.Namespace)
  @js.native
  /**
    * The TableList widget provides a way to display a list of tables associated with a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html)
    */
  class Class () extends TableList {
    def this(properties: TableListProperties) = this()
  }
  
  type _To = TableListConstructor
  
  /* This means you don't have to write `^`, but can instead just say `tableListMod.foo` */
  override def _to: TableListConstructor = ^
}
