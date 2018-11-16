package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpsertExpression
  extends PartialStatement
     with ScalablyTyped.runtime.Instantiable7[
      /* prev */ PartialStatement, 
      /* upsertExpr */ js.Any, 
      /* insertExpr */ js.Any, 
      /* replace */ scala.Boolean, 
      /* updateOrReplaceExpr */ js.Any, 
      /* collection */ js.Any, 
      /* options */ js.Any, 
      PartialStatement
    ] {
  var _updateOrReplace: java.lang.String = js.native
  def options(newOpts: js.Any): UpsertExpression = js.native
  def returnNew(x: js.Any): ReturnExpression = js.native
  def returnOld(x: js.Any): ReturnExpression = js.native
  def toAQL(): java.lang.String = js.native
}

