package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable7
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpsertExpression
  extends PartialStatement
     with Instantiable7[
      /* prev */ PartialStatement, 
      /* upsertExpr */ js.Any, 
      /* insertExpr */ js.Any, 
      /* replace */ Boolean, 
      /* updateOrReplaceExpr */ js.Any, 
      /* collection */ js.Any, 
      /* options */ js.Any, 
      PartialStatement
    ] {
  
  var _updateOrReplace: String = js.native
  
  def options(newOpts: js.Any): UpsertExpression = js.native
  
  def returnNew(x: js.Any): ReturnExpression = js.native
  
  def returnOld(x: js.Any): ReturnExpression = js.native
  
  def toAQL(): String = js.native
}
