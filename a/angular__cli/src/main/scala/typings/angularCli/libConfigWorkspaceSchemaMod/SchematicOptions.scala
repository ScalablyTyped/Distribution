package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchematicOptions
  extends StObject
     with /* property */ StringDictionary[Any] {
  
  @JSName("@schematics/angular:application")
  var `@schematicsSlashangularColonapplication`: js.UndefOr[AngularApplicationOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:class")
  var `@schematicsSlashangularColonclass`: js.UndefOr[AngularClassOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:component")
  var `@schematicsSlashangularColoncomponent`: js.UndefOr[AngularComponentOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:directive")
  var `@schematicsSlashangularColondirective`: js.UndefOr[AngularDirectiveOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:enum")
  var `@schematicsSlashangularColonenum`: js.UndefOr[AngularEnumOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:guard")
  var `@schematicsSlashangularColonguard`: js.UndefOr[AngularGuardOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:interceptor")
  var `@schematicsSlashangularColoninterceptor`: js.UndefOr[AngularInterceptorOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:interface")
  var `@schematicsSlashangularColoninterface`: js.UndefOr[AngularInterfaceOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:library")
  var `@schematicsSlashangularColonlibrary`: js.UndefOr[LibraryOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:ng-new")
  var `@schematicsSlashangularColonng-new`: js.UndefOr[AngularNgNewOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:pipe")
  var `@schematicsSlashangularColonpipe`: js.UndefOr[AngularPipeOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:resolver")
  var `@schematicsSlashangularColonresolver`: js.UndefOr[AngularResolverOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:service")
  var `@schematicsSlashangularColonservice`: js.UndefOr[AngularServiceOptionsSchema] = js.undefined
  
  @JSName("@schematics/angular:web-worker")
  var `@schematicsSlashangularColonweb-worker`: js.UndefOr[AngularWebWorkerOptionsSchema] = js.undefined
}
object SchematicOptions {
  
  inline def apply(): SchematicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchematicOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchematicOptions] (val x: Self) extends AnyVal {
    
    inline def `set@schematicsSlashangularColonapplication`(value: AngularApplicationOptionsSchema): Self = StObject.set(x, "@schematics/angular:application", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonapplicationUndefined`: Self = StObject.set(x, "@schematics/angular:application", js.undefined)
    
    inline def `set@schematicsSlashangularColonclass`(value: AngularClassOptionsSchema): Self = StObject.set(x, "@schematics/angular:class", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonclassUndefined`: Self = StObject.set(x, "@schematics/angular:class", js.undefined)
    
    inline def `set@schematicsSlashangularColoncomponent`(value: AngularComponentOptionsSchema): Self = StObject.set(x, "@schematics/angular:component", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColoncomponentUndefined`: Self = StObject.set(x, "@schematics/angular:component", js.undefined)
    
    inline def `set@schematicsSlashangularColondirective`(value: AngularDirectiveOptionsSchema): Self = StObject.set(x, "@schematics/angular:directive", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColondirectiveUndefined`: Self = StObject.set(x, "@schematics/angular:directive", js.undefined)
    
    inline def `set@schematicsSlashangularColonenum`(value: AngularEnumOptionsSchema): Self = StObject.set(x, "@schematics/angular:enum", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonenumUndefined`: Self = StObject.set(x, "@schematics/angular:enum", js.undefined)
    
    inline def `set@schematicsSlashangularColonguard`(value: AngularGuardOptionsSchema): Self = StObject.set(x, "@schematics/angular:guard", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonguardUndefined`: Self = StObject.set(x, "@schematics/angular:guard", js.undefined)
    
    inline def `set@schematicsSlashangularColoninterceptor`(value: AngularInterceptorOptionsSchema): Self = StObject.set(x, "@schematics/angular:interceptor", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColoninterceptorUndefined`: Self = StObject.set(x, "@schematics/angular:interceptor", js.undefined)
    
    inline def `set@schematicsSlashangularColoninterface`(value: AngularInterfaceOptionsSchema): Self = StObject.set(x, "@schematics/angular:interface", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColoninterfaceUndefined`: Self = StObject.set(x, "@schematics/angular:interface", js.undefined)
    
    inline def `set@schematicsSlashangularColonlibrary`(value: LibraryOptionsSchema): Self = StObject.set(x, "@schematics/angular:library", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonlibraryUndefined`: Self = StObject.set(x, "@schematics/angular:library", js.undefined)
    
    inline def `set@schematicsSlashangularColonng-new`(value: AngularNgNewOptionsSchema): Self = StObject.set(x, "@schematics/angular:ng-new", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonng-newUndefined`: Self = StObject.set(x, "@schematics/angular:ng-new", js.undefined)
    
    inline def `set@schematicsSlashangularColonpipe`(value: AngularPipeOptionsSchema): Self = StObject.set(x, "@schematics/angular:pipe", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonpipeUndefined`: Self = StObject.set(x, "@schematics/angular:pipe", js.undefined)
    
    inline def `set@schematicsSlashangularColonresolver`(value: AngularResolverOptionsSchema): Self = StObject.set(x, "@schematics/angular:resolver", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonresolverUndefined`: Self = StObject.set(x, "@schematics/angular:resolver", js.undefined)
    
    inline def `set@schematicsSlashangularColonservice`(value: AngularServiceOptionsSchema): Self = StObject.set(x, "@schematics/angular:service", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonserviceUndefined`: Self = StObject.set(x, "@schematics/angular:service", js.undefined)
    
    inline def `set@schematicsSlashangularColonweb-worker`(value: AngularWebWorkerOptionsSchema): Self = StObject.set(x, "@schematics/angular:web-worker", value.asInstanceOf[js.Any])
    
    inline def `set@schematicsSlashangularColonweb-workerUndefined`: Self = StObject.set(x, "@schematics/angular:web-worker", js.undefined)
  }
}
