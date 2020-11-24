package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogPattern extends js.Object {
  
  /**
    * A regular expression that defines the log pattern. A log pattern can contains at many as 50 characters, and it cannot be empty.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.native
  
  /**
    * The name of the log pattern. A log pattern name can contains at many as 50 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternName: js.UndefOr[LogPatternName] = js.native
  
  /**
    * The name of the log pattern. A log pattern name can contains at many as 30 characters, and it cannot be empty. The characters can be Unicode letters, digits or one of the following symbols: period, dash, underscore.
    */
  var PatternSetName: js.UndefOr[LogPatternSetName] = js.native
  
  /**
    * Rank of the log pattern.
    */
  var Rank: js.UndefOr[LogPatternRank] = js.native
}
object LogPattern {
  
  @scala.inline
  def apply(): LogPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPattern]
  }
  
  @scala.inline
  implicit class LogPatternOps[Self <: LogPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPattern(value: LogPatternRegex): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("Pattern", js.undefined)
    
    @scala.inline
    def setPatternName(value: LogPatternName): Self = this.set("PatternName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternName: Self = this.set("PatternName", js.undefined)
    
    @scala.inline
    def setPatternSetName(value: LogPatternSetName): Self = this.set("PatternSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatternSetName: Self = this.set("PatternSetName", js.undefined)
    
    @scala.inline
    def setRank(value: LogPatternRank): Self = this.set("Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("Rank", js.undefined)
  }
}
