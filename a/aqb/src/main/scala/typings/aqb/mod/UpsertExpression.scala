package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable7
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpsertExpression
  extends StObject
     with PartialStatement
     with Instantiable7[
      /* prev */ PartialStatement, 
      /* upsertExpr */ Any, 
      /* insertExpr */ Any, 
      /* replace */ Boolean, 
      /* updateOrReplaceExpr */ Any, 
      /* collection */ Any, 
      /* options */ Any, 
      PartialStatement
    ] {
  
  var _updateOrReplace: String = js.native
  
  def options(newOpts: Any): UpsertExpression = js.native
  
  def returnNew(x: Any): ReturnExpression = js.native
  
  def returnOld(x: Any): ReturnExpression = js.native
  
  def toAQL(): String = js.native
}
