package typings.aliApp

import typings.aliApp.my.ComponentRelation
import typings.aliApp.my.CreateIntersectionObserverOption
import typings.aliApp.my.IntersectionObserver
import typings.aliApp.my.Options
import typings.aliApp.my.PageScrollToOptions
import typings.aliApp.my.SelectorQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.PageOptions & ali-app.my.Page> */
trait PartialPageOptionsPage extends js.Object {
  var createIntersectionObserver: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[CreateIntersectionObserverOption], IntersectionObserver]
  ] = js.undefined
  var createSelectorQuery: js.UndefOr[js.Function0[SelectorQuery]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataset: js.UndefOr[String] = js.undefined
  var forceUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getRelationNodes: js.UndefOr[js.Function1[/* relationKey */ String, js.Array[ComponentRelation]]] = js.undefined
  var hasBehavior: js.UndefOr[js.Function1[/* behavior */ js.Any, Boolean]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.ThisFunction0[/* this */ typings.aliApp.my.Page, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ typings.aliApp.my.Page, Unit]] = js.undefined
  var onLaunch: js.UndefOr[js.ThisFunction1[/* this */ typings.aliApp.my.Page, /* options */ Options, Unit]] = js.undefined
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ typings.aliApp.my.Page, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction1[/* this */ typings.aliApp.my.Page, /* options */ Options, Unit]] = js.undefined
  var pageScrollTo: js.UndefOr[js.Function1[/* option */ js.UndefOr[PageScrollToOptions], Unit]] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var route: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectAllComponents: js.UndefOr[js.Function1[/* selector */ String, js.Array[typings.aliApp.my.Component]]] = js.undefined
  var selectComponent: js.UndefOr[js.Function1[/* selector */ String, typings.aliApp.my.Component]] = js.undefined
  var setData: js.UndefOr[
    js.Function2[/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  ] = js.undefined
  var triggerEvent: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* details */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[Partialbubblesbooleancomp], 
      Unit
    ]
  ] = js.undefined
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialPageOptionsPage {
  @scala.inline
  def apply(
    createIntersectionObserver: /* options */ js.UndefOr[CreateIntersectionObserverOption] => IntersectionObserver = null,
    createSelectorQuery: () => SelectorQuery = null,
    data: js.Any = null,
    dataset: String = null,
    forceUpdate: () => Unit = null,
    getRelationNodes: /* relationKey */ String => js.Array[ComponentRelation] = null,
    hasBehavior: /* behavior */ js.Any => Boolean = null,
    id: String = null,
    is: String = null,
    onError: js.ThisFunction0[/* this */ typings.aliApp.my.Page, Unit] = null,
    onHide: js.ThisFunction0[/* this */ typings.aliApp.my.Page, Unit] = null,
    onLaunch: js.ThisFunction1[/* this */ typings.aliApp.my.Page, /* options */ Options, Unit] = null,
    onPullDownRefresh: js.ThisFunction0[/* this */ typings.aliApp.my.Page, Unit] = null,
    onShow: js.ThisFunction1[/* this */ typings.aliApp.my.Page, /* options */ Options, Unit] = null,
    pageScrollTo: /* option */ js.UndefOr[PageScrollToOptions] => Unit = null,
    properties: js.Any = null,
    route: () => Unit = null,
    selectAllComponents: /* selector */ String => js.Array[typings.aliApp.my.Component] = null,
    selectComponent: /* selector */ String => typings.aliApp.my.Component = null,
    setData: (/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit = null,
    triggerEvent: (/* name */ String, /* details */ js.UndefOr[js.Any], /* options */ js.UndefOr[Partialbubblesbooleancomp]) => Unit = null,
    update: () => Unit = null
  ): PartialPageOptionsPage = {
    val __obj = js.Dynamic.literal()
    if (createIntersectionObserver != null) __obj.updateDynamic("createIntersectionObserver")(js.Any.fromFunction1(createIntersectionObserver))
    if (createSelectorQuery != null) __obj.updateDynamic("createSelectorQuery")(js.Any.fromFunction0(createSelectorQuery))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (forceUpdate != null) __obj.updateDynamic("forceUpdate")(js.Any.fromFunction0(forceUpdate))
    if (getRelationNodes != null) __obj.updateDynamic("getRelationNodes")(js.Any.fromFunction1(getRelationNodes))
    if (hasBehavior != null) __obj.updateDynamic("hasBehavior")(js.Any.fromFunction1(hasBehavior))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(onLaunch.asInstanceOf[js.Any])
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(onPullDownRefresh.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (pageScrollTo != null) __obj.updateDynamic("pageScrollTo")(js.Any.fromFunction1(pageScrollTo))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(js.Any.fromFunction0(route))
    if (selectAllComponents != null) __obj.updateDynamic("selectAllComponents")(js.Any.fromFunction1(selectAllComponents))
    if (selectComponent != null) __obj.updateDynamic("selectComponent")(js.Any.fromFunction1(selectComponent))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction2(setData))
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(js.Any.fromFunction3(triggerEvent))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    __obj.asInstanceOf[PartialPageOptionsPage]
  }
}

