package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPattern extends StObject {
  
  /**
    * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it cannot be empty.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.undefined
  
  /**
    * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternName: js.UndefOr[LogPatternName] = js.undefined
  
  /**
    * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternSetName: js.UndefOr[LogPatternSetName] = js.undefined
  
  /**
    * Rank of the log pattern.
    */
  var Rank: js.UndefOr[LogPatternRank] = js.undefined
}
object LogPattern {
  
  @scala.inline
  def apply(): LogPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPattern]
  }
  
  @scala.inline
  implicit class LogPatternMutableBuilder[Self <: LogPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPattern(value: LogPatternRegex): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternName(value: LogPatternName): Self = StObject.set(x, "PatternName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternNameUndefined: Self = StObject.set(x, "PatternName", js.undefined)
    
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternSetNameUndefined: Self = StObject.set(x, "PatternSetName", js.undefined)
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
    
    @scala.inline
    def setRank(value: LogPatternRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "Rank", js.undefined)
  }
}
