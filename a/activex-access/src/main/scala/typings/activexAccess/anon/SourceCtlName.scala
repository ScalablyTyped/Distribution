package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCtlName extends StObject {
  
  val SourceCtlName: String
  
  val SourceFieldList: Double
  
  val SourceRow: Double
  
  val X: Double
  
  val Y: Double
}
object SourceCtlName {
  
  @scala.inline
  def apply(SourceCtlName: String, SourceFieldList: Double, SourceRow: Double, X: Double, Y: Double): SourceCtlName = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCtlName]
  }
  
  @scala.inline
  implicit class SourceCtlNameMutableBuilder[Self <: SourceCtlName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceCtlName(value: String): Self = StObject.set(x, "SourceCtlName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFieldList(value: Double): Self = StObject.set(x, "SourceFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRow(value: Double): Self = StObject.set(x, "SourceRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "Y", value.asInstanceOf[js.Any])
  }
}
