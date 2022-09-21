package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertExpression
  extends StObject
     with PartialStatement
     with Instantiable4[
      /* prev */ PartialStatement, 
      /* expr */ Any, 
      /* collection */ Any, 
      /* options */ Any, 
      PartialStatement
    ] {
  
  def options(newOpts: Any): InsertExpression = js.native
  
  def returnNew(x: Any): ReturnExpression = js.native
  
  def toAQL(): String = js.native
}
