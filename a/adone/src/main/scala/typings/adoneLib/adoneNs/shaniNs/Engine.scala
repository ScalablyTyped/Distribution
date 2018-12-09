package typings
package adoneLib.adoneNs.shaniNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.Engine")
@js.native
class Engine () extends js.Object {
  def this(options: adoneLib.adoneNs.shaniNs.INs.EngineOptions) = this()
  /**
               * Returns a testing context
               */
  def context(): adoneLib.adoneNs.shaniNs.INs.Context = js.native
  /**
               * Excludes given paths from testing
               */
  def exclude(paths: java.lang.String*): scala.Unit = js.native
  /**
               * Includes given files as test files
               */
  def include(paths: java.lang.String*): scala.Unit = js.native
  /**
               * Starts testing
               */
  def start(): adoneLib.adoneNs.shaniNs.INs.Emitter = js.native
}

