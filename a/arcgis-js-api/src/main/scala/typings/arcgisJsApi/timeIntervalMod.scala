package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeInterval
import typings.arcgisJsApi.esri.TimeIntervalConstructor
import typings.arcgisJsApi.esri.TimeIntervalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeIntervalMod extends Shortcut {
  
  @JSImport("esri/TimeInterval", JSImport.Namespace)
  @js.native
  val ^ : TimeIntervalConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/TimeInterval", JSImport.Namespace)
  @js.native
  class Class () extends TimeInterval {
    def this(properties: TimeIntervalProperties) = this()
  }
  
  type _To = TimeIntervalConstructor
  
  /* This means you don't have to write `^`, but can instead just say `timeIntervalMod.foo` */
  override def _to: TimeIntervalConstructor = ^
}
