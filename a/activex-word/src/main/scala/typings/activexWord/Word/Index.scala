package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var AccentedLetters: Boolean
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  var Filter: WdIndexFilter
  
  var HeadingSeparator: WdHeadingSeparator
  
  var IndexLanguage: WdLanguageID
  
  var NumberOfColumns: Double
  
  val Parent: Any
  
  val Range: typings.activexWord.Word.Range
  
  var RightAlignPageNumbers: Boolean
  
  var SortBy: WdIndexSortBy
  
  var TabLeader: WdTabLeader
  
  var Type: WdIndexType
  
  def Update(): Unit
  
  /* private */ @JSName("Word.Index_typekey")
  var WordDotIndex_typekey: Index
}
object Index {
  
  inline def apply(
    AccentedLetters: Boolean,
    Application: Application,
    Creator: Double,
    Delete: () => Unit,
    Filter: WdIndexFilter,
    HeadingSeparator: WdHeadingSeparator,
    IndexLanguage: WdLanguageID,
    NumberOfColumns: Double,
    Parent: Any,
    Range: Range,
    RightAlignPageNumbers: Boolean,
    SortBy: WdIndexSortBy,
    TabLeader: WdTabLeader,
    Type: WdIndexType,
    Update: () => Unit,
    WordDotIndex_typekey: Index
  ): Index = {
    val __obj = js.Dynamic.literal(AccentedLetters = AccentedLetters.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Filter = Filter.asInstanceOf[js.Any], HeadingSeparator = HeadingSeparator.asInstanceOf[js.Any], IndexLanguage = IndexLanguage.asInstanceOf[js.Any], NumberOfColumns = NumberOfColumns.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RightAlignPageNumbers = RightAlignPageNumbers.asInstanceOf[js.Any], SortBy = SortBy.asInstanceOf[js.Any], TabLeader = TabLeader.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Update = js.Any.fromFunction0(Update))
    __obj.updateDynamic("Word.Index_typekey")(WordDotIndex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setAccentedLetters(value: Boolean): Self = StObject.set(x, "AccentedLetters", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFilter(value: WdIndexFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setHeadingSeparator(value: WdHeadingSeparator): Self = StObject.set(x, "HeadingSeparator", value.asInstanceOf[js.Any])
    
    inline def setIndexLanguage(value: WdLanguageID): Self = StObject.set(x, "IndexLanguage", value.asInstanceOf[js.Any])
    
    inline def setNumberOfColumns(value: Double): Self = StObject.set(x, "NumberOfColumns", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setRightAlignPageNumbers(value: Boolean): Self = StObject.set(x, "RightAlignPageNumbers", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: WdIndexSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setTabLeader(value: WdTabLeader): Self = StObject.set(x, "TabLeader", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdIndexType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction0(value))
    
    inline def setWordDotIndex_typekey(value: Index): Self = StObject.set(x, "Word.Index_typekey", value.asInstanceOf[js.Any])
  }
}
