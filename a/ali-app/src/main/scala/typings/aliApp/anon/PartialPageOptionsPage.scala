package typings.aliApp.anon

import typings.aliApp.my.Component
import typings.aliApp.my.ComponentRelation
import typings.aliApp.my.CreateIntersectionObserverOption
import typings.aliApp.my.IntersectionObserver
import typings.aliApp.my.Options
import typings.aliApp.my.Page
import typings.aliApp.my.PageScrollToOptions
import typings.aliApp.my.SelectorQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.PageOptions & ali-app.my.Page> */
@js.native
trait PartialPageOptionsPage extends js.Object {
  
  var createIntersectionObserver: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[CreateIntersectionObserverOption], IntersectionObserver]
  ] = js.native
  
  var createSelectorQuery: js.UndefOr[js.Function0[SelectorQuery]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataset: js.UndefOr[String] = js.native
  
  var forceUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var getRelationNodes: js.UndefOr[js.Function1[/* relationKey */ String, js.Array[ComponentRelation]]] = js.native
  
  var hasBehavior: js.UndefOr[js.Function1[/* behavior */ js.Any, Boolean]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var is: js.UndefOr[String] = js.native
  
  var onError: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]] = js.native
  
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]] = js.native
  
  var pageScrollTo: js.UndefOr[js.Function1[/* option */ js.UndefOr[PageScrollToOptions], Unit]] = js.native
  
  var properties: js.UndefOr[js.Any] = js.native
  
  var route: js.UndefOr[js.Function0[Unit]] = js.native
  
  var selectAllComponents: js.UndefOr[js.Function1[/* selector */ String, js.Array[Component]]] = js.native
  
  var selectComponent: js.UndefOr[js.Function1[/* selector */ String, Component]] = js.native
  
  var setData: js.UndefOr[
    js.Function2[/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  ] = js.native
  
  var triggerEvent: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* details */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[Partialbubblesbooleancomp], 
      Unit
    ]
  ] = js.native
  
  var update: js.UndefOr[js.Function0[Unit]] = js.native
}
object PartialPageOptionsPage {
  
  @scala.inline
  def apply(): PartialPageOptionsPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageOptionsPage]
  }
  
  @scala.inline
  implicit class PartialPageOptionsPageOps[Self <: PartialPageOptionsPage] (val x: Self) extends AnyVal {
    
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
    def setCreateIntersectionObserver(value: /* options */ js.UndefOr[CreateIntersectionObserverOption] => IntersectionObserver): Self = this.set("createIntersectionObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateIntersectionObserver: Self = this.set("createIntersectionObserver", js.undefined)
    
    @scala.inline
    def setCreateSelectorQuery(value: () => SelectorQuery): Self = this.set("createSelectorQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreateSelectorQuery: Self = this.set("createSelectorQuery", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = this.set("forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteForceUpdate: Self = this.set("forceUpdate", js.undefined)
    
    @scala.inline
    def setGetRelationNodes(value: /* relationKey */ String => js.Array[ComponentRelation]): Self = this.set("getRelationNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRelationNodes: Self = this.set("getRelationNodes", js.undefined)
    
    @scala.inline
    def setHasBehavior(value: /* behavior */ js.Any => Boolean): Self = this.set("hasBehavior", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasBehavior: Self = this.set("hasBehavior", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setOnError(value: js.ThisFunction0[/* this */ Page, Unit]): Self = this.set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ Page, Unit]): Self = this.set("onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = this.set("onLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLaunch: Self = this.set("onLaunch", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: js.ThisFunction0[/* this */ Page, Unit]): Self = this.set("onPullDownRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPullDownRefresh: Self = this.set("onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPageScrollTo(value: /* option */ js.UndefOr[PageScrollToOptions] => Unit): Self = this.set("pageScrollTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePageScrollTo: Self = this.set("pageScrollTo", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setRoute(value: () => Unit): Self = this.set("route", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setSelectAllComponents(value: /* selector */ String => js.Array[Component]): Self = this.set("selectAllComponents", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectAllComponents: Self = this.set("selectAllComponents", js.undefined)
    
    @scala.inline
    def setSelectComponent(value: /* selector */ String => Component): Self = this.set("selectComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectComponent: Self = this.set("selectComponent", js.undefined)
    
    @scala.inline
    def setSetData(value: (/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = this.set("setData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setTriggerEvent(
      value: (/* name */ String, /* details */ js.UndefOr[js.Any], /* options */ js.UndefOr[Partialbubblesbooleancomp]) => Unit
    ): Self = this.set("triggerEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTriggerEvent: Self = this.set("triggerEvent", js.undefined)
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
