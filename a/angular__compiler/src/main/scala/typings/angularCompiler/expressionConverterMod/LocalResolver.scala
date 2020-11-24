package typings.angularCompiler.expressionConverterMod

import typings.angularCompiler.outputAstMod.Expression
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalResolver extends js.Object {
  
  def getLocal(name: String): Expression | Null = js.native
  
  var globals: js.UndefOr[Set[String]] = js.native
  
  def notifyImplicitReceiverUse(): Unit = js.native
}
object LocalResolver {
  
  @scala.inline
  def apply(getLocal: String => Expression | Null, notifyImplicitReceiverUse: () => Unit): LocalResolver = {
    val __obj = js.Dynamic.literal(getLocal = js.Any.fromFunction1(getLocal), notifyImplicitReceiverUse = js.Any.fromFunction0(notifyImplicitReceiverUse))
    __obj.asInstanceOf[LocalResolver]
  }
  
  @scala.inline
  implicit class LocalResolverOps[Self <: LocalResolver] (val x: Self) extends AnyVal {
    
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
    def setGetLocal(value: String => Expression | Null): Self = this.set("getLocal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyImplicitReceiverUse(value: () => Unit): Self = this.set("notifyImplicitReceiverUse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGlobals(value: Set[String]): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
  }
}
