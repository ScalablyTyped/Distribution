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
    addClass: js.Function4[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    animate: js.Function5[
      /* element */ angularLib.JQuery, 
      /* fromStyles */ java.lang.String, 
      /* toStyles */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    beforeAddClass: js.Function4[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    beforeRemoveClass: js.Function4[
      /* element */ angularLib.JQuery, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    beforeSetClass: js.Function5[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    enter: js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    eventFn: js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    leave: js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    move: js.Function3[
      /* element */ angularLib.JQuery, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    removeClass: js.Function4[
      /* element */ angularLib.JQuery, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null,
    setClass: js.Function5[
      /* element */ angularLib.JQuery, 
      /* addedClasses */ java.lang.String, 
      /* removedClasses */ java.lang.String, 
      /* doneFunction */ angularLib.angularMod.Global.Function, 
      /* options */ IAnimationOptions, 
      _
    ] = null
  ): IAnimateCallbackObject = {
    val __obj = js.Dynamic.literal()
    if (addClass != null) __obj.updateDynamic("addClass")(addClass)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (beforeAddClass != null) __obj.updateDynamic("beforeAddClass")(beforeAddClass)
    if (beforeRemoveClass != null) __obj.updateDynamic("beforeRemoveClass")(beforeRemoveClass)
    if (beforeSetClass != null) __obj.updateDynamic("beforeSetClass")(beforeSetClass)
    if (enter != null) __obj.updateDynamic("enter")(enter)
    if (eventFn != null) __obj.updateDynamic("eventFn")(eventFn)
    if (leave != null) __obj.updateDynamic("leave")(leave)
    if (move != null) __obj.updateDynamic("move")(move)
    if (removeClass != null) __obj.updateDynamic("removeClass")(removeClass)
    if (setClass != null) __obj.updateDynamic("setClass")(setClass)
    __obj.asInstanceOf[IAnimateCallbackObject]
  }
}

