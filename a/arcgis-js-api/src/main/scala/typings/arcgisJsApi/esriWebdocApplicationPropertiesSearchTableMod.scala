package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SearchTable
import typings.arcgisJsApi.esri.SearchTableConstructor
import typings.arcgisJsApi.esri.SearchTableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocApplicationPropertiesSearchTableMod extends Shortcut {
  
  @JSImport("esri/webdoc/applicationProperties/SearchTable", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchTableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/applicationProperties/SearchTable", JSImport.Namespace)
  @js.native
  /**
    * Represents a table to be included in search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html)
    */
  open class Class ()
    extends StObject
       with SearchTable {
    def this(properties: SearchTableProperties) = this()
  }
  
  type _To = js.Object & SearchTableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocApplicationPropertiesSearchTableMod.foo` */
  override def _to: js.Object & SearchTableConstructor = ^
}
