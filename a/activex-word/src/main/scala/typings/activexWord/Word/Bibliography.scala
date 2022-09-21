package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bibliography extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var BibliographyStyle: String
  
  val Creator: Double
  
  def GenerateUniqueTag(): String
  
  val Parent: Any
  
  val Sources: typings.activexWord.Word.Sources
  
  /* private */ @JSName("Word.Bibliography_typekey")
  var WordDotBibliography_typekey: Bibliography
}
object Bibliography {
  
  inline def apply(
    Application: Application,
    BibliographyStyle: String,
    Creator: Double,
    GenerateUniqueTag: () => String,
    Parent: Any,
    Sources: Sources,
    WordDotBibliography_typekey: Bibliography
  ): Bibliography = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BibliographyStyle = BibliographyStyle.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], GenerateUniqueTag = js.Any.fromFunction0(GenerateUniqueTag), Parent = Parent.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Bibliography_typekey")(WordDotBibliography_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bibliography]
  }
  
  extension [Self <: Bibliography](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBibliographyStyle(value: String): Self = StObject.set(x, "BibliographyStyle", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setGenerateUniqueTag(value: () => String): Self = StObject.set(x, "GenerateUniqueTag", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSources(value: Sources): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setWordDotBibliography_typekey(value: Bibliography): Self = StObject.set(x, "Word.Bibliography_typekey", value.asInstanceOf[js.Any])
  }
}
