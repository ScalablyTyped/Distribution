package typings.aliApp.anon

import typings.aliApp.my.Component
import typings.aliApp.my.ComponentRelation
import typings.aliApp.my.CreateIntersectionObserverOption
import typings.aliApp.my.IntersectionObserver
import typings.aliApp.my.Options
import typings.aliApp.my.Page
import typings.aliApp.my.PageScrollToOptions
import typings.aliApp.my.SelectorQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.PageOptions & ali-app.my.Page> */
@js.native
trait PartialPageOptionsPage extends StObject {
  
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
  implicit class PartialPageOptionsPageMutableBuilder[Self <: PartialPageOptionsPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateIntersectionObserver(value: /* options */ js.UndefOr[CreateIntersectionObserverOption] => IntersectionObserver): Self = StObject.set(x, "createIntersectionObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateIntersectionObserverUndefined: Self = StObject.set(x, "createIntersectionObserver", js.undefined)
    
    @scala.inline
    def setCreateSelectorQuery(value: () => SelectorQuery): Self = StObject.set(x, "createSelectorQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSelectorQueryUndefined: Self = StObject.set(x, "createSelectorQuery", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setForceUpdate(value: () => Unit): Self = StObject.set(x, "forceUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceUpdateUndefined: Self = StObject.set(x, "forceUpdate", js.undefined)
    
    @scala.inline
    def setGetRelationNodes(value: /* relationKey */ String => js.Array[ComponentRelation]): Self = StObject.set(x, "getRelationNodes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRelationNodesUndefined: Self = StObject.set(x, "getRelationNodes", js.undefined)
    
    @scala.inline
    def setHasBehavior(value: /* behavior */ js.Any => Boolean): Self = StObject.set(x, "hasBehavior", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasBehaviorUndefined: Self = StObject.set(x, "hasBehavior", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
    
    @scala.inline
    def setOnError(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = StObject.set(x, "onLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    @scala.inline
    def setOnPullDownRefresh(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onPullDownRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.ThisFunction1[/* this */ Page, /* options */ Options, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setPageScrollTo(value: /* option */ js.UndefOr[PageScrollToOptions] => Unit): Self = StObject.set(x, "pageScrollTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPageScrollToUndefined: Self = StObject.set(x, "pageScrollTo", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRoute(value: () => Unit): Self = StObject.set(x, "route", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setSelectAllComponents(value: /* selector */ String => js.Array[Component]): Self = StObject.set(x, "selectAllComponents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectAllComponentsUndefined: Self = StObject.set(x, "selectAllComponents", js.undefined)
    
    @scala.inline
    def setSelectComponent(value: /* selector */ String => Component): Self = StObject.set(x, "selectComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectComponentUndefined: Self = StObject.set(x, "selectComponent", js.undefined)
    
    @scala.inline
    def setSetData(value: (/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    @scala.inline
    def setTriggerEvent(
      value: (/* name */ String, /* details */ js.UndefOr[js.Any], /* options */ js.UndefOr[Partialbubblesbooleancomp]) => Unit
    ): Self = StObject.set(x, "triggerEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
