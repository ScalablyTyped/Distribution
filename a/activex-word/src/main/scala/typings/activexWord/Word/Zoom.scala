package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Zoom extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  var PageColumns: Double
  
  var PageFit: WdPageFit
  
  var PageRows: Double
  
  val Parent: js.Any
  
  var Percentage: Double
  
  @JSName("Word.Zoom_typekey")
  var WordDotZoom_typekey: Zoom
}
object Zoom {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    PageColumns: Double,
    PageFit: WdPageFit,
    PageRows: Double,
    Parent: js.Any,
    Percentage: Double,
    WordDotZoom_typekey: Zoom
  ): Zoom = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PageColumns = PageColumns.asInstanceOf[js.Any], PageFit = PageFit.asInstanceOf[js.Any], PageRows = PageRows.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Percentage = Percentage.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Zoom_typekey")(WordDotZoom_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zoom]
  }
  
  @scala.inline
  implicit class ZoomMutableBuilder[Self <: Zoom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageColumns(value: Double): Self = StObject.set(x, "PageColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageFit(value: WdPageFit): Self = StObject.set(x, "PageFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRows(value: Double): Self = StObject.set(x, "PageRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentage(value: Double): Self = StObject.set(x, "Percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotZoom_typekey(value: Zoom): Self = StObject.set(x, "Word.Zoom_typekey", value.asInstanceOf[js.Any])
  }
}
