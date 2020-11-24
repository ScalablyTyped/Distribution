package typings.alt.altContainerMod

import org.scalablytyped.runtime.StringDictionary
import typings.alt.AltJS.Alt
import typings.alt.AltJS.AltStore
import typings.react.mod.Component
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerProps extends js.Object {
  
  var actions: js.UndefOr[StringDictionary[js.Object]] = js.native
  
  var component: js.UndefOr[Component[_, js.Object, _]] = js.native
  
  var flux: js.UndefOr[Alt] = js.native
  
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, ReactElement]] = js.native
  
  var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.native
  
  var store: js.UndefOr[AltStore[_]] = js.native
  
  var stores: js.UndefOr[js.Array[AltStore[_]]] = js.native
  
  var transform: js.UndefOr[js.Function2[/* store */ AltStore[_], /* actions */ js.Any, _]] = js.native
}
object ContainerProps {
  
  @scala.inline
  def apply(): ContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerProps]
  }
  
  @scala.inline
  implicit class ContainerPropsOps[Self <: ContainerProps] (val x: Self) extends AnyVal {
    
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
    def setActions(value: StringDictionary[js.Object]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setComponent(value: Component[_, js.Object, _]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setFlux(value: Alt): Self = this.set("flux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlux: Self = this.set("flux", js.undefined)
    
    @scala.inline
    def setInject(value: StringDictionary[js.Any]): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    
    @scala.inline
    def setRender(value: /* repeated */ js.Any => ReactElement): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setShouldComponentUpdate(value: /* props */ js.Any => Boolean): Self = this.set("shouldComponentUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldComponentUpdate: Self = this.set("shouldComponentUpdate", js.undefined)
    
    @scala.inline
    def setStore(value: AltStore[_]): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setStoresVarargs(value: AltStore[js.Any]*): Self = this.set("stores", js.Array(value :_*))
    
    @scala.inline
    def setStores(value: js.Array[AltStore[_]]): Self = this.set("stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStores: Self = this.set("stores", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* store */ AltStore[_], /* actions */ js.Any) => _): Self = this.set("transform", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
