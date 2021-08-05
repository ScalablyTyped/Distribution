package typings.addMatchers

import typings.addMatchers.mod.MatchersByName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BeforeEach extends StObject {
    
    var beforeEach: js.Any
    
    var jasmine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ js.Any
  }
  object BeforeEach {
    
    inline def apply(
      beforeEach: js.Any,
      jasmine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ js.Any
    ): BeforeEach = {
      val __obj = js.Dynamic.literal(beforeEach = beforeEach.asInstanceOf[js.Any], jasmine = jasmine.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeEach]
    }
    
    extension [Self <: BeforeEach](x: Self) {
      
      inline def setBeforeEach(value: js.Any): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
      
      inline def setJasmine(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ js.Any
      ): Self = StObject.set(x, "jasmine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(matchersByName: MatchersByName): Unit = js.native
    
    def asymmetric(matchersByName: MatchersByName): Unit = js.native
  }
  
  trait Expect extends StObject {
    
    var expect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Expect */ js.Any
  }
  object Expect {
    
    inline def apply(
      expect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Expect */ js.Any
    ): Expect = {
      val __obj = js.Dynamic.literal(expect = expect.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expect]
    }
    
    extension [Self <: Expect](x: Self) {
      
      inline def setExpect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Expect */ js.Any
      ): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    }
  }
}
