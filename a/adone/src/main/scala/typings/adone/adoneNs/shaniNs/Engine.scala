package typings.adone.adoneNs.shaniNs

import typings.adone.adoneNs.shaniNs.INs.Context
import typings.adone.adoneNs.shaniNs.INs.Emitter
import typings.adone.adoneNs.shaniNs.INs.EngineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.Engine")
@js.native
class Engine () extends js.Object {
  def this(options: EngineOptions) = this()
  /**
    * Returns a testing context
    */
  def context(): Context = js.native
  /**
    * Excludes given paths from testing
    */
  def exclude(paths: String*): Unit = js.native
  /**
    * Includes given files as test files
    */
  def include(paths: String*): Unit = js.native
  /**
    * Starts testing
    */
  def start(): Emitter = js.native
}

