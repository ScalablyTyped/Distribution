package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $postLink lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IPostLink extends StObject {
  
  /**
    * Called after this controller's element and its children have been linked. Similar to the post-link function this
    * hook can be used to set up DOM event handlers and do direct DOM manipulation. Note that child elements that contain
    * templateUrl directives will not have been compiled and linked since they are waiting for their template to load
    * asynchronously and their own compilation and linking has been suspended until that occurs. This hook can be considered
    * analogous to the ngAfterViewInit and ngAfterContentInit hooks in Angular 2. Since the compilation process is rather
    * different in Angular 1 there is no direct mapping and care should be taken when upgrading.
    */
  @JSName("$postLink")
  def $postLink(): Unit
}
object IPostLink {
  
  @scala.inline
  def apply($postLink: () => Unit): IPostLink = {
    val __obj = js.Dynamic.literal($postLink = js.Any.fromFunction0($postLink))
    __obj.asInstanceOf[IPostLink]
  }
  
  @scala.inline
  implicit class IPostLinkMutableBuilder[Self <: IPostLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$postLink(value: () => Unit): Self = StObject.set(x, "$postLink", js.Any.fromFunction0(value))
  }
}
