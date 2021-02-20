package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Task
import typings.arcgisJsApi.esri.TaskConstructor
import typings.arcgisJsApi.esri.TaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod extends Shortcut {
  
  @JSImport("esri/tasks/Task", JSImport.Namespace)
  @js.native
  val ^ : TaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/Task", JSImport.Namespace)
  @js.native
  class Class () extends Task {
    def this(properties: TaskProperties) = this()
  }
  
  type _To = TaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `taskMod.foo` */
  override def _to: TaskConstructor = ^
}
