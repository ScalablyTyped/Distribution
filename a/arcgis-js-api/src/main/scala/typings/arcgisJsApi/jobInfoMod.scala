package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.JobInfo
import typings.arcgisJsApi.esri.JobInfoConstructor
import typings.arcgisJsApi.esri.JobInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobInfoMod extends Shortcut {
  
  @JSImport("esri/tasks/support/JobInfo", JSImport.Namespace)
  @js.native
  val ^ : JobInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/JobInfo", JSImport.Namespace)
  @js.native
  class Class () extends JobInfo {
    def this(properties: JobInfoProperties) = this()
  }
  
  type _To = JobInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `jobInfoMod.foo` */
  override def _to: JobInfoConstructor = ^
}
