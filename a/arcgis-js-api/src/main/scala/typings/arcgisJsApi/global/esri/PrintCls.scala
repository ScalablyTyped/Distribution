package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PrintProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Print")
@js.native
/**
  * The Print widget connects your application with a [printing service](https://enterprise.arcgis.com/en/portal/latest/administer/windows/configure-the-portal-to-print-maps.htm) to allow the map to be printed.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html)
  */
open class PrintCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Print_ {
  def this(properties: PrintProperties) = this()
}
