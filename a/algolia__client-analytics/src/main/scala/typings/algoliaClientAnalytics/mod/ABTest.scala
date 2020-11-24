package typings.algoliaClientAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ABTest extends js.Object {
  
  /**
    * The ab test end date, if any.
    */
  val endAt: String = js.native
  
  /**
    * The ab test name.
    */
  val name: String = js.native
  
  /**
    * The ab test list of variants.
    */
  val variants: js.Array[Variant] = js.native
}
object ABTest {
  
  @scala.inline
  def apply(endAt: String, name: String, variants: js.Array[Variant]): ABTest = {
    val __obj = js.Dynamic.literal(endAt = endAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variants = variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABTest]
  }
  
  @scala.inline
  implicit class ABTestOps[Self <: ABTest] (val x: Self) extends AnyVal {
    
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
    def setEndAt(value: String): Self = this.set("endAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsVarargs(value: Variant*): Self = this.set("variants", js.Array(value :_*))
    
    @scala.inline
    def setVariants(value: js.Array[Variant]): Self = this.set("variants", value.asInstanceOf[js.Any])
  }
}
