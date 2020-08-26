package typings.angularAnimate.mod.angularAugmentingMod.animate

import typings.angular.JQuery
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimateCallbackObject extends js.Object {
  var addClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var animate: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* fromStyles */ String, 
      /* toStyles */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var beforeAddClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var beforeRemoveClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var beforeSetClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var enter: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var eventFn: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var leave: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var move: js.UndefOr[
    js.Function3[/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions, _]
  ] = js.native
  var removeClass: js.UndefOr[
    js.Function4[
      /* element */ JQuery, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
  var setClass: js.UndefOr[
    js.Function5[
      /* element */ JQuery, 
      /* addedClasses */ String, 
      /* removedClasses */ String, 
      /* doneFunction */ Function, 
      /* options */ IAnimationOptions, 
      _
    ]
  ] = js.native
}

object IAnimateCallbackObject {
  @scala.inline
  def apply(): IAnimateCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimateCallbackObject]
  }
  @scala.inline
  implicit class IAnimateCallbackObjectOps[Self <: IAnimateCallbackObject] (val x: Self) extends AnyVal {
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
    def setAddClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = this.set("addClass", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAddClass: Self = this.set("addClass", js.undefined)
    @scala.inline
    def setAnimate(
      value: (/* element */ JQuery, /* fromStyles */ String, /* toStyles */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = this.set("animate", js.Any.fromFunction5(value))
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBeforeAddClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = this.set("beforeAddClass", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeAddClass: Self = this.set("beforeAddClass", js.undefined)
    @scala.inline
    def setBeforeRemoveClass(
      value: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = this.set("beforeRemoveClass", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeRemoveClass: Self = this.set("beforeRemoveClass", js.undefined)
    @scala.inline
    def setBeforeSetClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = this.set("beforeSetClass", js.Any.fromFunction5(value))
    @scala.inline
    def deleteBeforeSetClass: Self = this.set("beforeSetClass", js.undefined)
    @scala.inline
    def setEnter(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = this.set("enter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setEventFn(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = this.set("eventFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteEventFn: Self = this.set("eventFn", js.undefined)
    @scala.inline
    def setLeave(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = this.set("leave", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    @scala.inline
    def setMove(value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => _): Self = this.set("move", js.Any.fromFunction3(value))
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setRemoveClass(
      value: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = this.set("removeClass", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRemoveClass: Self = this.set("removeClass", js.undefined)
    @scala.inline
    def setSetClass(
      value: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => _
    ): Self = this.set("setClass", js.Any.fromFunction5(value))
    @scala.inline
    def deleteSetClass: Self = this.set("setClass", js.undefined)
  }
  
}

