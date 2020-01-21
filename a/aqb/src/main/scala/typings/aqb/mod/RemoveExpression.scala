package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveExpression
  extends PartialStatement
     with Instantiable4[
      /* prev */ PartialStatement, 
      /* expr */ js.Any, 
      /* collection */ js.Any, 
      /* options */ js.Any, 
      PartialStatement
    ] {
  def options(newOpts: js.Any): RemoveExpression = js.native
  def returnOld(x: js.Any): ReturnExpression = js.native
  def toAQL(): String = js.native
}

