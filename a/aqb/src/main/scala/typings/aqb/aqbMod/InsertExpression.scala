package typings.aqb.aqbMod

import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertExpression
  extends PartialStatement
     with Instantiable4[
      /* prev */ PartialStatement, 
      /* expr */ js.Any, 
      /* collection */ js.Any, 
      /* options */ js.Any, 
      PartialStatement
    ] {
  def options(newOpts: js.Any): InsertExpression = js.native
  def returnNew(x: js.Any): ReturnExpression = js.native
  def toAQL(): String = js.native
}

