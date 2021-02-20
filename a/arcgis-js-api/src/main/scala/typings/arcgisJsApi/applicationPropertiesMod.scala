package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ApplicationProperties
import typings.arcgisJsApi.esri.ApplicationPropertiesConstructor
import typings.arcgisJsApi.esri.ApplicationPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationPropertiesMod extends Shortcut {
  
  @JSImport("esri/webmap/ApplicationProperties", JSImport.Namespace)
  @js.native
  val ^ : ApplicationPropertiesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/ApplicationProperties", JSImport.Namespace)
  @js.native
  class Class () extends ApplicationProperties {
    def this(properties: ApplicationPropertiesProperties) = this()
  }
  
  type _To = ApplicationPropertiesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `applicationPropertiesMod.foo` */
  override def _to: ApplicationPropertiesConstructor = ^
}
