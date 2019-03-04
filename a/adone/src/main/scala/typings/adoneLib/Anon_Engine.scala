package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Engine extends js.Object {
  var Engine: org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[/* options */ adoneLib.adoneNs.shaniNs.INs.EngineOptions], 
    adoneLib.adoneNs.shaniNs.Engine
  ]
  val INs: Anon_BlockCallback
  val utilNs: Anon_ArgsAssert
}

object Anon_Engine {
  @scala.inline
  def apply(
    Engine: org.scalablytyped.runtime.Instantiable1[
      /* options */ js.UndefOr[/* options */ adoneLib.adoneNs.shaniNs.INs.EngineOptions], 
      adoneLib.adoneNs.shaniNs.Engine
    ],
    INs: Anon_BlockCallback,
    utilNs: Anon_ArgsAssert
  ): Anon_Engine = {
    val __obj = js.Dynamic.literal(Engine = Engine, INs = INs, utilNs = utilNs)
  
    __obj.asInstanceOf[Anon_Engine]
  }
}

