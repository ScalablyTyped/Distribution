package typings.aqb.mod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveExpression
  extends StObject
     with PartialStatement
     with Instantiable4[
      /* prev */ PartialStatement, 
      /* expr */ Any, 
      /* collection */ Any, 
      /* options */ Any, 
      PartialStatement
    ] {
  
  def options(newOpts: Any): RemoveExpression = js.native
  
  def returnOld(x: Any): ReturnExpression = js.native
  
  def toAQL(): String = js.native
}
