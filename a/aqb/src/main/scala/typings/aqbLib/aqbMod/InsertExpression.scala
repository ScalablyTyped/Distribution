package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertExpression
  extends PartialStatement
     with ScalablyTyped.runtime.Instantiable4[
      /* prev */ PartialStatement, 
      /* expr */ js.Any, 
      /* collection */ js.Any, 
      /* options */ js.Any, 
      PartialStatement
    ] {
  def options(newOpts: js.Any): InsertExpression = js.native
  def returnNew(x: js.Any): ReturnExpression = js.native
  def toAQL(): java.lang.String = js.native
}

