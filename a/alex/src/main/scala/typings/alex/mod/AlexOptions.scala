package typings.alex.mod

import typings.alex.alexNumbers.`0`
import typings.alex.alexNumbers.`1`
import typings.alex.alexNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlexOptions extends js.Object {
  
  /** an array of rules (the default is []) */
  var allow: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When provided, only the rules specified are reported.
    * @default []
    */
  var deny: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * When turned on (`true`), pairs such as `he` and `she` and `garbageman` or `garbagewoman` are seen as errors.
    * When turned off (`false`, the default), such pairs are okay
    */
  var noBinary: js.UndefOr[Boolean] = js.native
  
  /**
    * the minimum rating (including) that you want to check for.
    * If you set it to 1 (maybe) then it will warn for level 1 and 2 (likely) profanities,
    * but not for level 0 (unlikely).
    */
  var profanitySureness: js.UndefOr[`0` | `1` | `2`] = js.native
}
object AlexOptions {
  
  @scala.inline
  def apply(): AlexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlexOptions]
  }
  
  @scala.inline
  implicit class AlexOptionsOps[Self <: AlexOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowVarargs(value: String*): Self = this.set("allow", js.Array(value :_*))
    
    @scala.inline
    def setAllow(value: js.Array[String]): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    
    @scala.inline
    def setDenyVarargs(value: String*): Self = this.set("deny", js.Array(value :_*))
    
    @scala.inline
    def setDeny(value: js.Array[String]): Self = this.set("deny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeny: Self = this.set("deny", js.undefined)
    
    @scala.inline
    def setNoBinary(value: Boolean): Self = this.set("noBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBinary: Self = this.set("noBinary", js.undefined)
    
    @scala.inline
    def setProfanitySureness(value: `0` | `1` | `2`): Self = this.set("profanitySureness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfanitySureness: Self = this.set("profanitySureness", js.undefined)
  }
}
