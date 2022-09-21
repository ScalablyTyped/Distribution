package typings.angularCore.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "TestabilityRegistry")
@js.native
open class TestabilityRegistry () extends StObject {
  
  /**
    * Find testability of a node in the Tree
    * @param elem node
    * @param findInAncestors whether finding testability in ancestors if testability was not found in
    * current node
    */
  def findTestabilityInTree(elem: Node): Testability | Null = js.native
  def findTestabilityInTree(elem: Node, findInAncestors: Boolean): Testability | Null = js.native
  
  /**
    * Get all registered applications(root elements)
    */
  def getAllRootElements(): js.Array[Any] = js.native
  
  /**
    * Get all registered testabilities
    */
  def getAllTestabilities(): js.Array[Testability] = js.native
  
  /**
    * Get a testability hook associated with the application
    * @param elem root element
    */
  def getTestability(elem: Any): Testability | Null = js.native
  
  /**
    * Registers an application with a testability hook so that it can be tracked
    * @param token token of application, root element
    * @param testability Testability hook
    */
  def registerApplication(token: Any, testability: Testability): Unit = js.native
  
  /**
    * Unregisters all applications
    */
  def unregisterAllApplications(): Unit = js.native
  
  /**
    * Unregisters an application.
    * @param token token of application, root element
    */
  def unregisterApplication(token: Any): Unit = js.native
}
/* static members */
object TestabilityRegistry {
  
  @JSImport("@angular/core", "TestabilityRegistry")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core", "TestabilityRegistry.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[TestabilityRegistry, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[TestabilityRegistry, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/core", "TestabilityRegistry.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[TestabilityRegistry] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[TestabilityRegistry]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
