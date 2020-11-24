package typings.audiosprite.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("audiosprite", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(files: js.Array[String], callback: js.Function2[/* error */ Error, /* obj */ Result, Unit]): Unit = js.native
  def apply(
    files: js.Array[String],
    option: Option,
    callback: js.Function2[/* error */ Error, /* obj */ Result, Unit]
  ): Unit = js.native
}
