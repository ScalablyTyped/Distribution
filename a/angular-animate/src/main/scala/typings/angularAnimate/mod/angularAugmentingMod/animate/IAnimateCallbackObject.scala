package typings.angularAnimate.mod.angularAugmentingMod.animate

import typings.angular.JQuery
import typings.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateCallbackObject extends js.Object {
  var addClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var animate: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* fromStyles */ String, 
      /* toStyles */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeAddClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeRemoveClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeSetClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var enter: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var eventFn: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var leave: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var move: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.undefined
  var removeClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var setClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
}

object IAnimateCallbackObject {
  @scala.inline
  def apply(
    addClass: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    animate: (/* element */ JQuery, /* fromStyles */ String, /* toStyles */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    beforeAddClass: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    beforeRemoveClass: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    beforeSetClass: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    enter: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    eventFn: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    leave: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    move: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    removeClass: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null,
    setClass: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _ = null
  ): IAnimateCallbackObject = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(js.Any.fromFunction4(addClass))
    if (animate != null) __obj.updateDynamic("animate")(js.Any.fromFunction5(animate))
    if (beforeAddClass != null) __obj.updateDynamic("beforeAddClass")(js.Any.fromFunction4(beforeAddClass))
    if (beforeRemoveClass != null) __obj.updateDynamic("beforeRemoveClass")(js.Any.fromFunction4(beforeRemoveClass))
    if (beforeSetClass != null) __obj.updateDynamic("beforeSetClass")(js.Any.fromFunction5(beforeSetClass))
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction3(enter))
    if (eventFn != null) __obj.updateDynamic("eventFn")(js.Any.fromFunction3(eventFn))
    if (leave != null) __obj.updateDynamic("leave")(js.Any.fromFunction3(leave))
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction3(move))
    if (removeClass != null) __obj.updateDynamic("removeClass")(js.Any.fromFunction4(removeClass))
    if (setClass != null) __obj.updateDynamic("setClass")(js.Any.fromFunction5(setClass))
    __obj.asInstanceOf[IAnimateCallbackObject]
  }
}

