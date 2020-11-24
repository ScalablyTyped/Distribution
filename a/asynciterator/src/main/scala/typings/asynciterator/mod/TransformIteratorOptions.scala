package typings.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformIteratorOptions[S] extends BufferedIteratorOptions {
  
  var destroySource: js.UndefOr[Boolean] = js.native
  
  var optional: js.UndefOr[Boolean] = js.native
  
  var source: js.UndefOr[SourceExpression[S]] = js.native
}
object TransformIteratorOptions {
  
  @scala.inline
  def apply[S](): TransformIteratorOptions[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformIteratorOptions[S]]
  }
  
  @scala.inline
  implicit class TransformIteratorOptionsOps[Self <: TransformIteratorOptions[_], S] (val x: Self with TransformIteratorOptions[S]) extends AnyVal {
    
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
    def setDestroySource(value: Boolean): Self = this.set("destroySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroySource: Self = this.set("destroySource", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setSourceFunction0(value: () => AsyncIteratorOrPromise[S]): Self = this.set("source", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSource(value: SourceExpression[S]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
