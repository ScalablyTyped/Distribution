package typings.appleMapkitJsBrowser.global.mapkit

import typings.appleMapkitJsBrowser.mapkit.GeoJSONDelegate
import typings.appleMapkitJsBrowser.mapkit.ImportGeoJSONCallback
import typings.appleMapkitJsBrowser.mapkit.ItemCollection
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("mapkit.importGeoJSON")
@js.native
object importGeoJSON extends js.Object {
  
  /**
    *
    * @param data The original GeoJSON data, which may be a URL to a GeoJSON file,
    * or a GeoJSON object.
    * @param callback A callback function that is required if you provide a URL
    * for the data parameter, and optional otherwise.
    */
  def apply(data: String): ItemCollection | Error = js.native
  def apply(data: String, callback: GeoJSONDelegate): ItemCollection | Error = js.native
  def apply(data: String, callback: ImportGeoJSONCallback): ItemCollection | Error = js.native
  def apply(data: js.Object): ItemCollection | Error = js.native
  def apply(data: js.Object, callback: GeoJSONDelegate): ItemCollection | Error = js.native
  def apply(data: js.Object, callback: ImportGeoJSONCallback): ItemCollection | Error = js.native
}
