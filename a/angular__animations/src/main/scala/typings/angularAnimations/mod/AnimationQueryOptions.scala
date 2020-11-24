package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationQueryOptions extends AnimationOptions {
  
  /**
    * A maximum total number of results to return from the query.
    * If negative, results are limited from the end of the query list towards the beginning.
    * By default, results are not limited.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * True if this query is optional, false if it is required. Default is false.
    * A required query throws an error if no elements are retrieved when
    * the query is executed. An optional query does not.
    *
    */
  var optional: js.UndefOr[Boolean] = js.native
}
object AnimationQueryOptions {
  
  @scala.inline
  def apply(): AnimationQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationQueryOptions]
  }
  
  @scala.inline
  implicit class AnimationQueryOptionsOps[Self <: AnimationQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
}
