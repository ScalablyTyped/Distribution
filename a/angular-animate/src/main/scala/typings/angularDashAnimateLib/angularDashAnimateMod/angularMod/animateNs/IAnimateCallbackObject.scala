package typings
package angularDashAnimateLib.angularDashAnimateMod.angularMod.animateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateCallbackObject extends js.Object {
  var addClass: js.UndefOr[
    js.Function4[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var animate: js.UndefOr[
    js.Function5[
      /* element */ angularLib.JQuery, 
      /* fromStyles */ java.lang.String, 
      /* toStyles */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeAddClass: js.UndefOr[
    js.Function4[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeRemoveClass: js.UndefOr[
    js.Function4[
      /* element */ angularLib.JQuery, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var beforeSetClass: js.UndefOr[
    js.Function5[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var enter: js.UndefOr[
    js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var eventFn: js.UndefOr[
    js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var leave: js.UndefOr[
    js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var move: js.UndefOr[
    js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var removeClass: js.UndefOr[
    js.Function4[
      /* element */ angularLib.JQuery, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
  var setClass: js.UndefOr[
    js.Function5[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.undefined
}

object IAnimateCallbackObject {
  @scala.inline
  def apply(
    addClass: (/* element */ angularLib.JQuery, /* addedClasses */ java.lang.String, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    animate: (/* element */ angularLib.JQuery, /* fromStyles */ java.lang.String, /* toStyles */ java.lang.String, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    beforeAddClass: (/* element */ angularLib.JQuery, /* addedClasses */ java.lang.String, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    beforeRemoveClass: (/* element */ angularLib.JQuery, /* removedClasses */ java.lang.String, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    beforeSetClass: (/* element */ angularLib.JQuery, /* addedClasses */ java.lang.String, /* removedClasses */ java.lang.String, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    enter: (/* element */ angularLib.JQuery, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    eventFn: (/* element */ angularLib.JQuery, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    leave: (/* element */ angularLib.JQuery, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    move: (/* element */ angularLib.JQuery, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    removeClass: (/* element */ angularLib.JQuery, /* removedClasses */ java.lang.String, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null,
    setClass: (/* element */ angularLib.JQuery, /* addedClasses */ java.lang.String, /* removedClasses */ java.lang.String, /* doneFunction */ angularLib.angularMod.Global.Function, /* options */ IAnimationOptions) => _ = null
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

